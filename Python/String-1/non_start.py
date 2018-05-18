import unittest

'''

Given 2 strings, return their concatenation, except omit the first char of each.
The strings will be at least length 1.


non_start('Hello', 'There') -> 'ellohere'
non_start('java', 'code') -> 'avaode'
non_start('shotl', 'java') -> 'hotlava'

'''

def non_start(a, b):
  
    if len(a)<1 and len(b)<1:
        return ''
  
    return a[1:]+b[1:] 


class Test_non_start(unittest.TestCase):

    def test_1(self):
        self.assertEqual(non_start('Hello', 'There'), 'ellohere')

    def test_2(self):
        self.assertEqual(non_start('java', 'code'), 'avaode')

    def test_3(self):
        self.assertEqual(non_start('shotl', 'java'), 'hotlava')


if __name__ == '__main__':
    unittest.main()   