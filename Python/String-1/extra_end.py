import unittest

'''

Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.


extra_end('Hello') -> 'lololo'
extra_end('ab') -> 'ababab'
extra_end('Hi') -> 'HiHiHi'

'''

def extra_end(str):
    
    char2 = str[len(str)-2]+str[len(str)-1]
 
    return 3*char2  


class Test_extra_end(unittest.TestCase):

    def test_1(self):
        self.assertEqual(extra_end('Hello'), 'lololo')

    def test_2(self):
        self.assertEqual(extra_end('Hello'), 'lololo')

    def test_3(self):
        self.assertEqual(extra_end('Hello'), 'lololo')


if __name__ == '__main__':
    unittest.main()   