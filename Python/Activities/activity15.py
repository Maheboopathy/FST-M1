#trying to print x variable which is not defined
try:
    print(x)
except NameError:
    print("x has'nt been defined yet")