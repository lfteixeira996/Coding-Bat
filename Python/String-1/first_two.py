import unittest

'''

Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".


first_two('Hello') -> 'He'
first_two('abcdefg') -> 'ab'
first_two('ab') -> 'ab'

'''

def first_two(str):

    if len(str) < 2:
        return str
  
    else:
        return str[:2] 
   

class Test_first_two(unittest.TestCase):

    def test_1(self):
        self.assertEqual(first_two('Hello'), 'He')

    def test_2(self):
        self.assertEqual(first_two('abcdefg'), 'ab')

    def test_3(self):
        self.assertEqual(first_two('ab'), 'ab')


if __name__ == '__main__':
    unittest.main()  