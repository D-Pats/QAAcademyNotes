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
    print(int(result))
    # ==============

print(calculator(2, 4, "+")) # Should print 6 to the console
print(calculator(10, 3, "-")) # Should print 7 to the console
print(calculator(4, 7, "*")) # Should print 28 to the console
print(calculator(100, 2, "/")) # Should print 50 to the console
