import unittest

'''

Given a string, return a string where for every char in the original, there are two chars.


double_char('The') -> 'TThhee'
double_char('AAbb') -> 'AAAAbbbb'
double_char('Hi-There') -> 'HHii--TThheerree'

'''

def double_char(str):
 
    res = '' 
    val = len(str)
 
    for i in range(0,(val)):
        res=res + (2*str[i])
  
 
    return res 


class Test_double_char(unittest.TestCase):

    def test_1(self):
        self.assertEqual(double_char('The'), 'TThhee')

    def test_2(self):
        self.assertEqual(double_char('AAbb'), 'AAAAbbbb')

    def test_3(self):
        self.assertEqual(double_char('Hi-There'), 'HHii--TThheerree')


if __name__ == '__main__':
    unittest.main() 