import unittest
'''
Given an array of ints, return True if one of the first 4 elements in the array is a 9. The array length may be less than 4.

array_front9([1, 2, 9, 3, 4]) -> True
array_front9([1, 2, 3, 4, 9]) -> False
array_front9([1, 2, 3, 4, 5]) -> False
'''

def array_front9(nums):
 
    if len(nums)>4:
        for i in range(0,4):
            if nums[i] == 9:
                return True   
 
    else:
        for i in range(0,len(nums)):
            if nums[i] == 9:
                return True 
 
        return False      
 
 
 
class Test_array_front9(unittest.TestCase):

    def test_1(self):
        self.assertEqual(array_front9([1, 2, 9, 3, 4]), True)

    def test_2(self):
        self.assertEqual(array_front9([1, 2, 3, 4, 9]), False)

    def test_3(self):
        self.assertEqual(array_front9([1, 2, 3, 4, 5]), False)


if __name__ == '__main__':
    unittest.main() 