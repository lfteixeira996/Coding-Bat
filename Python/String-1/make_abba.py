import unittest

'''

Given two strings, a and b, return the result of putting them together in the order abba, 
e.g. "Hi" and "Bye" returns "HiByeByeHi".


make_abba('Hi', 'Bye') -> 'HiByeByeHi'
make_abba('Yo', 'Alice') -> 'YoAliceAliceYo'
make_abba('What', 'Up') -> 'WhatUpUpWhat'

'''

def make_abba(a, b):
  
    return a+b+b+a


class Test_make_abba(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_abba('Hi', 'Bye'), 'HiByeByeHi')

    def test_2(self):
        self.assertEqual(make_abba('Yo', 'Alice'), 'YoAliceAliceYo')

    def test_3(self):
        self.assertEqual(make_abba('What', 'Up'), 'WhatUpUpWhat')


if __name__ == '__main__':
    unittest.main()     