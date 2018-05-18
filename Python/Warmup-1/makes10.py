import unittest

'''

Given 2 ints, a and b, return True if one if them is 10 or if their sum is 10.


makes10(9, 10) -> True
makes10(9, 9) -> False
makes10(1, 9) -> True

'''

def makes10(a, b):
 
    if (a==10) or (b==10):
        return True
  
    elif (a+b)==10:
        return True
  
    return False 
     
     
     
class Test_makes10(unittest.TestCase):

    def test_1(self):
        self.assertEqual(makes10(9, 10), True)

    def test_2(self):
        self.assertEqual(makes10(9, 9),  False)

    def test_3(self):
        self.assertEqual(makes10(1, 9),  True)


if __name__ == '__main__':
    unittest.main() 