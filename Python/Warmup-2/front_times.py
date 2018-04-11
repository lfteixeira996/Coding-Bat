import unittest

'''
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


front_times('Chocolate', 2) -> 'ChoCho'
front_times('Chocolate', 3) -> 'ChoChoCho'
front_times('Abc', 3) -> 'AbcAbcAbc'

'''

def front_times(str, n):
  
 if n>0 and len(str)>=1:
  return n*str[:3]
  
 elif n==0 or len(str)==0:
  return ''           


 class Test_front_times(unittest.TestCase):

    def test_1(self):
        self.assertEqual(front_times('Chocolate', 2), 'ChoCho')

    def test_2(self):
        self.assertEqual(front_times('Chocolate', 3), 'ChoChoCho')

    def test_3(self):
        self.assertEqual(front_times('Abc', 3), 'AbcAbcAbc')


if __name__ == '__main__':
    unittest.main() 