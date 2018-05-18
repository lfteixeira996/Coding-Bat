import unittest

'''
Given a string, return the count of the number of times that a substring 
length 2 appears in the string and also as the last 2 chars of the string, 
so "hixxxhi" yields 1 (we won't count the end substring).


last2('hixxhi') -> 1
last2('xaxxaxaxx') -> 1
last2('axxxaaxx') -> 2

'''

def last2(str):




class Test_last2(unittest.TestCase):

    def test_1(self):
        self.assertEqual(last2('hixxhi'), 1)

    def test_2(self):
        self.assertEqual(last2('xaxxaxaxx'), 1)

    def test_3(self):
        self.assertEqual(last2('xaxxaxaxx'), 1)


if __name__ == '__main__':
    unittest.main() 