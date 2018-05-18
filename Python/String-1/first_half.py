import unittest

'''

Given a string of even length, return the first half. 
So the string "WooHoo" yields "Woo".


first_half('WooHoo') -> 'Woo'
first_half('HelloThere') -> 'Hello'
first_half('abcdef') -> 'abc'

'''

def first_half(str):
  
    even = len(str)%2
 
    if even == 0:
        return str[:len(str)/2]
  
    return str 
 
 
class Test_first_half(unittest.TestCase):

    def test_1(self):
        self.assertEqual(first_half('WooHoo'), 'Woo')

    def test_2(self):
        self.assertEqual(first_half('HelloThere'), 'Hello')

    def test_3(self):
        self.assertEqual(first_half('HelloThere'), 'Hello')


if __name__ == '__main__':
    unittest.main()  