import unittest

'''
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
The string length will be at least 2.


left2('Hello') -> 'lloHe'
left2('java') -> 'vaja'
left2('Hi') -> 'Hi'

'''

def left2(str):
  
    if len(str) < 2:
        return str
  
    return str[2:]+str[:2] 
 
class Test_make_abba(unittest.TestCase):

    def test_1(self):
        self.assertEqual(left2('Hello'), 'lloHe')

    def test_2(self):
        self.assertEqual(left2('java'), 'vaja')

    def test_3(self):
        self.assertEqual(left2('Hi'), 'Hi')


if __name__ == '__main__':
    unittest.main()  