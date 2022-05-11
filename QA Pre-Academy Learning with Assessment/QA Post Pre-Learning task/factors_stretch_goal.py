def factors(number):
# ==============
# Your code here
    fact_list  = []
    for i in range(1, number):
        if number % i == 0 and i != 1:
            fact_list.append(i)
    if fact_list == []:
        print(number, 'is a prime number')
    else:
        print(fact_list)
# ==============

print(factors(15))  # Should print [3, 5] to the console
print(factors(12))  # Should print [2, 3, 4, 6] to the console
print(factors(13))  # Should print “13 is a prime number”
