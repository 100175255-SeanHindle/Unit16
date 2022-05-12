passwordScore = 0
allowedChars = set('qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!%&*+=')
specialChars = set('!%&*+=')
isValid = False
while isValid == False:
    ratedPassword = input("enter password to be rated: ")
    if any(char not in allowedChars for char in ratedPassword):
        print("Illegal characters entered")
        continue
    if len(ratedPassword) < 8:
        print("password too short")
        continue
    if len(ratedPassword) > 15:
        print("password too long")
        continue
    else:
        isValid = True

        
if len(ratedPassword) > 9:
    passwordScore += 20
    print(passwordScore)

if ratedPassword.isalnum() == False:
    if ratedPassword.islower() == True:    
        for char in ratedPassword:
            passwordScore -= 3
            print(passwordScore)
            
elif ratedPassword.isalnum():
        for char in ratedPassword:
            if char.islower() ==True:
                passwordScore += 5
                print(passwordScore)

if ratedPassword.isalnum() == False:
    if ratedPassword.isupper() == True:
        for char in ratedPassword:
            passwordScore -= 3
            print(passwordScore)

else:
        for char in ratedPassword:
            if char.isupper() == True:
                passwordScore += 5
                print(passwordScore)

if all(char in specialChars for char in ratedPassword):
    for char in ratedPassword:
        passwordScore -= 5
        print(passwordScore)

else:
    for char in ratedPassword:
       if char.isalnum():
           passwordScore += 10
           print(passwordScore)




        
print (passwordScore)
match passwordScore:
    case passwordScore if passwordScore < 21:
        print("Password strength: Very Bad")
        
    case passwordScore if 21 < passwordScore < 41:
        print("Password strength: Bad")
        
    case passwordScore if 40 < passwordScore < 61:
        print("Password strength: Average")
        
    case passwordScore if 60 < passwordScore < 81:
       print("Password strength:Good")
        
    case passwordScore if passwordScore > 80:
        print("Password strength: Very Good")
