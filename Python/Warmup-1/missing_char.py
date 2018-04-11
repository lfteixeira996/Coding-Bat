import unittest

'''


Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..len(str)-1 inclusive).


missing_char('kitten', 1) -> 'ktten'
missing_char('kitten', 0) -> 'itten'
missing_char('kitten', 4) -> 'kittn'

'''

def missing_char(str, n):
  front = str[:n]   # up to but not including n
  back = str[n+1:]  # n+1 through end of string
  return front + back 


class Test_missing_char(unittest.TestCase):

    def test_1(self):
        self.assertEqual(missing_char('kitten', 1), 'ktten')

    def test_2(self):
        self.assertEqual(missing_char('kitten', 0), 'itten')

    def test_3(self):
        self.assertEqual(missing_char('kitten', 4), 'kittn')


if __name__ == '__main__':
    unittest.main()  
