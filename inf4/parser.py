import time

def parse(json, proto):
    proto.write('message Schedule {\n')

    Inherit = 0
    ch = []
    lastMsg = []

    for line in json:
        array = line.split()
        for i in range(len(array)):
            if array[i] == '{':
                Inherit += 1
                ch.append(0)
            elif array[i] == '}' or array[i] == '},':
                Inherit -= 1
                if len(lastMsg) != 0:
                    proto.write(Inherit * '\t' + '}\n' + '\n')
                    proto.write(Inherit * '\t' + 'required ' + lastMsg[-1].upper() + ' ' + lastMsg[-1] + ' = ' + str(
                        ch[Inherit - 1]) + ';\n')
                    ch[Inherit - 1] += 1
                    ch.pop()
                    lastMsg.pop()
            else:
                data = array[i].split('"')
                msgName = data[1]
                if array[-1] != '{':
                    proto.write(Inherit * '\t' + 'required string ' + msgName + ' = ' + str(ch[Inherit - 1]) + ';\n')
                    ch[Inherit - 1] += 1
                else:
                    proto.write('\n' + Inherit * '\t' + 'message ' + msgName.upper() + ' {\n')
                    lastMsg.append(msgName)
                    Inherit += 1
                    ch.append(0)
                break

    proto.write('}')

    if Inherit != 0:
        raise BaseException

if __name__ == '__main__':
    start_time = time.time()
    fileJSON = 'inputJSON' #input('введите названия JSON файла: ')
    filePROTOBUF = 'outputPROTOBUF' #input('введите названия PROTOBUF файла: ')
    json = open(fileJSON, 'r', encoding='UTF-8')
    proto = open(filePROTOBUF, 'w', encoding='UTF-8')


    try:
        parse(json, proto)
    except BaseException:
        proto.close()
        proto = open(filePROTOBUF, 'w', encoding='UTF-8')
        proto.write('Invalid JSON')
        print('Invalid JSON')
        json.close()
        proto.close()
    else:
        json.close()
        proto.close()
    print("%s seconds" % (time.time() - start_time))