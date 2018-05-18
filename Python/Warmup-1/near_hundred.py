import unittest

'''

Given an int n, return True if it is within 10 of 100 or 200. Note: abs(num) computes the absolute value of a number.


near_hundred(93) -> True
near_hundred(90) -> True
near_hundred(89) -> False

'''

def near_hundred(n):
  
    check = abs(n)
 
    if (check>=90 and check<=110) or (check>=190 and check<=210):
        return True
  
    return False 
 
 
 
class Test_near_hundred(unittest.TestCase):

    def test_1(self):
        self.assertEqual(near_hundred(93), True)

    def test_2(self):
        self.assertEqual(near_hundred(90), True)

    def test_3(self):
        self.assertEqual(near_hundred(89), False)


if __name__ == '__main__':
    unittest.main()  