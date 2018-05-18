import unittest

'''

Return the "centered" average of an array of ints, 
which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. 
If there are multiple copies of the smallest value, ignore just
one copy, and likewise for the largest value. Use int division 
to produce the final average. You may assume that the array is 
length 3 or more.


centered_average([1, 2, 3, 4, 100]) -> 3
centered_average([1, 1, 5, 5, 10, 8, 7]) -> 5
centered_average([-10, -4, -2, -4, -2, 0]) -> -3

'''
#Return max value
def max_val(nums):

    ret = nums[0]
    
    for i in range(1, len(nums)):
        if ret < nums[i]:
            ret = nums[i]
            
    
    return ret

#Return min value
def min_val(nums):

    ret = nums[0]
    
    for i in range(1, len(nums)):
        if ret > nums[i]:
            ret = nums[i]
            
    
    return ret


#Centered Average
def centered_average(nums):
  
    find_max = False
    find_min = False
    maxval   = max_val(nums)
    minval   = min_val(nums)
    num      = 0
    den = 0
   
    for item in nums:
       
        if item != maxval and item != minval:
            num += item
            den += 1
       
        if item == maxval and find_max == True:
            num += item
            den += 1

        if item == minval and find_min == True:
            num += item
            den += 1           
        
        if item == maxval and find_max == False:
            find_max = True
           
        if item == minval and find_min == False:
            find_min = True
               
      
    return num//den     
   
   
class Test_centered_average(unittest.TestCase):

    def test_1(self):
        self.assertEqual(centered_average([1, 2, 3, 4, 100]), 3)

    def test_2(self):
        self.assertEqual(centered_average([1, 1, 5, 5, 10, 8, 7]), 5)

    def test_3(self):
        self.assertEqual(centered_average([-10, -4, -2, -4, -2, 0]), -3)


if __name__ == '__main__':
    unittest.main()            