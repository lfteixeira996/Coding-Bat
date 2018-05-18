import unittest

'''
Given an array of ints, return True if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) -> True
array123([1, 1, 2, 4, 1]) -> False
array123([1, 1, 2, 1, 2, 3]) -> True

'''

def array123(nums):
  
    for i in range(len(nums)):
        if (i<len(nums)-2)and nums[i]==1 and nums[i+1]==2 and nums[i+2]==3:
            return True
  
    return False  
 
 
 
class Test_array123(unittest.TestCase):

    def test_1(self):
        self.assertEqual(array123([1, 1, 2, 3, 1]), True)

    def test_2(self):
        self.assertEqual(array123([1, 1, 2, 4, 1]), False)

    def test_3(self):
        self.assertEqual(array123([1, 1, 2, 1, 2, 3]), True)


if __name__ == '__main__':
    unittest.main() 