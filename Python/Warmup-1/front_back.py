import unittest

'''


Given a string, return a new string where the first and last chars have been exchanged.


front_back('code')  -> 'eodc'
front_back('a')     -> 'a'
front_back('ab')    -> 'bafrom symbol import import_as_name
'

'''

def front_back(str):

    if len(str) == 1:
        return str
 
    elif len(str) == 2:
        return str[1]+str[0]
  
    elif len(str) > 2:  
        return str[len(str)-1] + str[1:(len(str)-1)] + str[0]  

    return '' 
 
 
 
class Test_front_back(unittest.TestCase):

    def test_1(self):
        self.assertEqual(front_back('code'), 'eodc')

    def test_2(self):
        self.assertEqual(front_back('a'), 'a')

    def test_3(self):
        self.assertEqual(front_back('ab'), 'ba')


if __name__ == '__main__':
    unittest.main() 
    
  