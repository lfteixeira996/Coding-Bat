import unittest

'''
Given an int array length 2, return True if it contains a 2 or a 3.


has23([2, 5]) -> True
has23([4, 3]) -> True
has23([4, 5]) -> False

'''

def has23(nums):
  
 if nums[0]==2 or nums[1]==2:
  return True
  
 elif nums[0]==3 or nums[1]==3:
  return True
 
 return False 
 
 
class Test_has23(unittest.TestCase):

    def test_1(self):
        self.assertEqual(has23([2, 5]), True)

    def test_2(self):
        self.assertEqual(has23([4, 3]), True)

    def test_3(self):
        self.assertEqual(has23([4, 5]), False)


if __name__ == '__main__':
    unittest.main()  