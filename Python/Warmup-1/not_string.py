import unittest

'''

Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.


not_string('candy')     -> 'not candy'
not_string('x')         -> 'not x'
not_string('not bad')   -> 'not bad'

'''


def not_string(str):
 if(len(str) >= 3 and str[0]=='n' and str[1]=='o' and str[2]=='t'):
  return str
  
 else:
  return 'not ' + str;   


class Test_not_string(unittest.TestCase):

    def test_1(self):
        self.assertEqual(not_string('candy'),'not candy')

    def test_isupper(self):
        self.assertEqual(not_string('x'), 'not x')

    def test_split(self):
        self.assertEqual(not_string('not bad'), 'not bad')


if __name__ == '__main__':
    unittest.main()