def vowel_swapper(string):
    # ==============
    # Your code here
    string_final = ''
    lower_string = string.lower()
    index_first = lower_string.find('a',0)
    if index_first != -1:
        index_second = lower_string.find('a',index_first+1)
        string_first = string[0:index_second]
        string_second = string[index_second:]
        if string_second[0].islower() == True:
            string_second = string_second.replace('a', '/\\', 1)
            string_final = string_first + string_second
        else:
            string_second = string_second.replace('A', '/\\', 1)
            string_final = string_first + string_second
    else:
        string_final = string
    lower_string_final = string_final.lower()
    index_first = lower_string_final.find('e', 0)
    if index_first != -1:
        index_second = lower_string_final.find('e',index_first+1)
        string_first = string_final[0:index_second]
        string_second = string_final[index_second:]
        if string_second[0].islower() == True:
            string_second = string_second.replace('e', '3', 1)
            string_final = string_first + string_second
        else:
            string_second = string_second.replace('E', '3', 1)
            string_final = string_first + string_second
    else:
        string_final = string_final
    lower_string_final = string_final.lower()
    index_first = lower_string_final.find('i', 0)
    if index_first != -1:
        index_second = lower_string_final.find('i', index_first + 1)
        string_first = string_final[0:index_second]
        string_second = string_final[index_second:]
        if string_second[0].islower() == True:
            string_second = string_second.replace('i', '!', 1)
            string_final = string_first + string_second
        else:
            string_second = string_second.replace('I', '!', 1)
            string_final = string_first + string_second
    lower_string_final = string_final.lower()
    index_first = lower_string_final.find('o', 0)
    if index_first != -1:
        index_second = lower_string_final.find('o', index_first + 1)
        string_first = string_final[0:index_second]
        string_second = string_final[index_second:]
        if string_second[0].islower() == True:
            string_second = string_second.replace('o', 'ooo', 1)
            string_final = string_first + string_second
        else:
            string_second = string_second.replace('O', '000', 1)
            string_final = string_first + string_second
    lower_string_final = string_final.lower()
    index_first = lower_string_final.find('u', 0)
    if index_first != -1:
        index_second = lower_string_final.find('u', index_first + 1)
        string_first = string_final[0:index_second]
        string_second = string_final[index_second:]
        if string_second[0].islower() == True:
            string_second = string_second.replace('u', '\\/', 1)
            string_final = string_first + string_second
        else:
            string_second = string_second.replace('U', '\\/', 1)
            string_final = string_first + string_second
    print(string_final)
    # ==============

print(vowel_swapper("aAa eEe iIi oOo uUu")) # Should print "a/\a e3e i!i o000o u\/u" to the console
print(vowel_swapper("Hello World")) # Should print "Hello Wooorld" to the console
print(vowel_swapper("Everything's Available")) # Should print "Ev3rything's Av/\!lable" to the console