def gomgomhi(n):
    gomgom = set()
    count = 0
    for _ in range(n):
        word = input()

        if word!='ENTER' and word not in gomgom:
            count += 1
            gomgom.add(word)
        
        elif word == 'ENTER':
            gomgom.clear()

    return count
print(gomgomhi(int(input())))