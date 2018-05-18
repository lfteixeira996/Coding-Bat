import unittest

'''
Given 3 int values, a b c, return their sum. 
However, if one of the values is the same as another of the values, it does not count towards the sum.


lone_sum(1, 2, 3) -> 6
lone_sum(3, 2, 3) -> 2
lone_sum(3, 3, 3) -> 0

'''

def lone_sum(a, b, c):
  
    res = 0

    if a!=b and a!=c:
        res +=a
  
    if a!=b and b!=c:
        res +=b 
  
    if a!=c and b!=c:
        res +=c
  
    return res  
 
class Test_lone_sum(unittest.TestCase):

    def test_1(self):
        self.assertEqual(lone_sum(1, 2, 3), 6)

    def test_2(self):
        self.assertEqual(lone_sum(3, 2, 3), 2)

    def test_3(self):
        self.assertEqual(lone_sum(3, 3, 3), 0)


if __name__ == '__main__':
    unittest.main()        