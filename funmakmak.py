def main():
    n = int(input())
    a = n
    for x in range(n+1):
        for y in range(x):
            print(a,end=" ")
            a -= 1
        print()
        a = n 
main()