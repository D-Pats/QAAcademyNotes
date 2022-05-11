def vowel_swapper(string):
    # ==============
    # Your code here
    vowel_list = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    dictionary = {'a': '4', 'A': '4','e': '3', 'E': '3', 'i': '!', 'I':'!', 'o': 'ooo', 'O': '000', 'u': '|_|', 'U':'|_|'}
    for i in vowel_list:
        string = string.replace(i, dictionary[i])
    print(string)
    # ==============


print(vowel_swapper("aA eE iI oO uU"))  # Should print "44 33 !! ooo000 |_||_|" to the console
print(vowel_swapper("Hello World"))  # Should print "H3llooo Wooorld" to the console
print(vowel_swapper("Everything's Available"))  # Should print "3v3ryth!ng's 4v4!l4bl3" to the console
