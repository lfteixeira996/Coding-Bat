import unittest

'''

Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) -> True
has22([1, 2, 1, 2]) -> False
has22([2, 1, 2]) -> False

'''

def has22(nums):
  
    for i in range(len(nums)-1):
    
        if(nums[i] == nums[i+1] == 2):
            return True
  
    return False   


class Test_has22(unittest.TestCase):

    def test_1(self):
        self.assertEqual(has22([1, 2, 2]), True)

    def test_2(self):
        self.assertEqual(has22([1, 2, 1, 2]), False)

    def test_3(self):
        self.assertEqual(has22([2, 1, 2]), False)


if __name__ == '__main__':
    unittest.main() 