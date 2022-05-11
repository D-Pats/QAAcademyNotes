def vowel_swapper(string):
    # ==============
    # Your code here
    vowel_list = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    dictionary = {'a': '4', 'A': '4','e': '3', 'E': '3', 'i': '!', 'I':'!', 'o': 'ooo', 'O': '000', 'u': '|_|', 'U':'|_|'}
    lower_string = string.lower()
    index_first = 0
    final_string = ''
    for i in vowel_list:
        index_first = lower_string.find(i,0)
        print(lower_string)
        if index_first != -1 and i == 'a':
            index_second = lower_string.find(i, index_first + 1)
            string_first = string[0:index_second]
            string_second = string[index_second:]
            string_second.replace(i,dictionary[i])
            final_string = string_first + string_second
            print(final_string)
        elif index_first != -1:
            index_second = final_string.find(i, index_first + 1)
            string_first = string[0:index_second]
            string_second = string[index_second:]
            string_second.replace(i,dictionary[i])
            final_string = string_first + string_second
            print(final_string)
    #print(final_string)
    # ==============

print(vowel_swapper("aAa eEe iIi oOo uUu")) # Should print "a/\a e3e i!i o000o u\/u" to the console
#print(vowel_swapper("Hello World")) # Should print "Hello Wooorld" to the console
#print(vowel_swapper("Everything's Available")) # Should print "Ev3rything's Av/\!lable" to the console