import unittest

'''

Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) -> 6
sum13([1, 1]) -> 2
sum13([1, 2, 2, 1, 13]) -> 6

'''

def sum13(nums):
    res = 0  

    if len(nums) == 0:
        return 0
 
    else:
        
        i = 0
        while i<len(nums):
            if nums[i] == 13:
                i +=1
    
            else:
                res = res + nums[i]
  
            i +=1
            
    return res   


class Test_sum13(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sum13([1, 2, 2, 1]), 6)

    def test_2(self):
        self.assertEqual(sum13([1, 1]), 2)

    def test_3(self):
        self.assertEqual(sum13([1, 2, 2, 1, 13]), 6)


if __name__ == '__main__':
    unittest.main() 