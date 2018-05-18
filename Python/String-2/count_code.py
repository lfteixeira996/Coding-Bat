import  unittest


'''

Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


count_code('aaacodebbb') -> 1
count_code('codexxcode') -> 2
count_code('cozexxcope') -> 2

'''

def count_code(str):
  
    substring1 = "code"
    substring2 = "cooe"
    substring3 = "cope"
    count      = 0
    
    count = str.count(substring1)
    count += str.count(substring2)
    count += str.count(substring3)
    
    return count
    


class Test_count_code(unittest.TestCase):

    def test_1(self):
        self.assertEqual(count_code('aaacodebbb'), 1)

    def test_2(self):
        self.assertEqual(count_code('codexxcode'), 2)

    def test_3(self):
        self.assertEqual(count_code('cozexxcope'), 2)


if __name__ == '__main__':
    unittest.main() 