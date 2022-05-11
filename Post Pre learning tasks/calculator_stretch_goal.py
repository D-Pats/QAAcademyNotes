def calculator(a, b, operator):
    # ==============
    # Your code here
    if operator == '+':
        result = a + b
    elif operator == '-':
        result = a - b
    elif operator == '*':
        result = a * b
    else:
        result = a / b
    print(bin(int(result))[2:])
    # ==============

print(calculator(2, 4, "+")) # Should print 110 to the console
print(calculator(10, 3, "-")) # Should print 111 to the console
print(calculator(4, 7, "*")) # Should output 11100 to the console
print(calculator(100, 2, "/")) # Should print 110010 to the console
