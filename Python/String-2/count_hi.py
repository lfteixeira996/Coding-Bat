

'''

Return the number of times that the string "hi" appears anywhere in the given string.


count_hi('abc hi ho') -> 1
count_hi('ABChi hi') -> 2
count_hi('hihi') -> 2

'''

def count_hi(str):
  
    count = 0
  
    for i in range(len(str)-1):
        z = i+1
        
        if(str[i]=='h' and str[i+1]=='i'):
            count +=1

    return count 

class Test_count_hi(unittest.TestCase):

    def test_1(self):
        self.assertEqual(count_code('aaacodebbb'), 1)

    def test_2(self):
        self.assertEqual(count_code('codexxcode'), 2)

    def test_3(self):
        self.assertEqual(count_code('cozexxcope'), 0)


if __name__ == '__main__':
    unittest.main() 