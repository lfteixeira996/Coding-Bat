import unittest
'''

Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sum_double(1, 2) -> 3
sum_double(3, 2) -> 5
sum_double(2, 2) -> 8

'''

def sum_double(a, b):
  
    if a == b:
        return 2*(a+b)  
  
    return a + b
 
 
class Test_sum_double(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sum_double(1, 2), 3)

    def test_2(self):
        self.assertEqual(sum_double(3, 2), 5)

    def test_3(self):
        self.assertEqual(sum_double(2, 2), 8)


if __name__ == '__main__':
    unittest.main()  