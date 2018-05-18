import unittest

'''

For this problem, we'll round an int value up to the next multiple of 10 
if its rightmost digit is 5 or more, so 15 rounds up to 20. 
Alternately, round down to the previous multiple of 10 if 
its rightmost digit is less than 5, so 12 rounds down to 10. 
Given 3 ints, a b c, return the sum of their rounded values. 
To avoid code repetition, write a separate helper "def round10(num):" and call it 3 times. 
Write the helper entirely below and at the same indent level as round_sum().


round_sum(16, 17, 18) -> 60
round_sum(12, 13, 14) -> 30
round_sum(6, 4, 4) -> 10

'''

def round_sum(a, b, c):
  
    res = round10(a)
 
    res = res + round10(b)
 
    res = res + round10(c)
 
    return res
  
def round10(num):
  
    if num <=10:
        if num<5:
            return 0
  
        else:
            return 10
 
    else:
        rem = num%10
  
        if rem<5:
            return num-rem
   
        else:
            return (num-rem)+10 
        
class Test_no_teen_sum(unittest.TestCase):

    def test_1(self):
        self.assertEqual(round_sum(16, 17, 18), 60)

    def test_2(self):
        self.assertEqual(round_sum(12, 13, 14), 30)

    def test_3(self):
        self.assertEqual(round_sum(6, 4, 4), 10)


if __name__ == '__main__':
    unittest.main()           