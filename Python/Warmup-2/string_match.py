import unittest

'''
Given 2 strings, a and b, return the number of the positions where they contain
the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both strings.


string_match('xxcaazz', 'xxbaaz') -> 3
string_match('abc', 'abc') -> 2
string_match('abc', 'axc') -> 0

'''

def string_match(a, b):
  





class Test_front_back(unittest.TestCase):

    def test_1(self):
        self.assertEqual(front_back('code'), 'eodc')

    def test_2(self):
        self.assertEqual(front_back('a'), 'a')

    def test_3(self):
        self.assertEqual(front_back('ab'), 'ba')


if __name__ == '__main__':
    unittest.main() 