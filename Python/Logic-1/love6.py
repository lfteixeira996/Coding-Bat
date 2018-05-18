import unittest

'''

The number 6 is a truly great number. 
Given two int values, a and b, return True if either one is 6.
Or if their sum or difference is 6. 
Note: the function abs(num) computes the absolute value of a number.


love6(6, 4) -> True
love6(4, 5) -> False
love6(1, 5) -> True

'''

def love6(a, b):
  
    if a==6 or b==6:
        return True
  
    elif a+b==6 or abs(a-b)==6:
        return True
  
    return False

 
class Test_love6(unittest.TestCase):

    def test_1(self):
        self.assertEqual(love6(6, 4), True)

    def test_2(self):
        self.assertEqual(love6(4, 5), False)

    def test_3(self):
        self.assertEqual(love6(1, 5), True)


if __name__ == '__main__':
    unittest.main()      