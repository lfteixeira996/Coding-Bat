import  unittest

'''

Return True if the string "cat" and "dog" appear 
the same number of times in the given string.


cat_dog('catdog') -> True
cat_dog('catcat') -> False
cat_dog('1cat1cadodog') -> True

'''

def cat_dog(str):
  
    cat_count = 0
    dog_count = 0
    
    for i in range(len(str)-2):    
        if str[i] == 'c' and str[i+1] == 'a' and str[i+2] == 't':
            cat_count += 1
    
        if str[i] == 'd' and str[i+1] == 'o' and str[i+2] == 'g':
            dog_count += 1
        
    if cat_count == dog_count:
        return True
    
    else:
        return False
 
    
class Test_cat_dog(unittest.TestCase):

    def test_1(self):
        self.assertEqual(cat_dog('catdog'), True)

    def test_2(self):
        self.assertEqual(cat_dog('catcat'), False)

    def test_3(self):
        self.assertEqual(cat_dog('1cat1cadodog'), True)


if __name__ == '__main__':
    unittest.main()      