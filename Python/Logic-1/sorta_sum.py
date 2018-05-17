import unittest

'''

Given 2 ints, a and b, return their sum. 
However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.


sorta_sum(3, 4) -> 7
sorta_sum(9, 4) -> 20
sorta_sum(10, 11) -> 21

'''

def sorta_sum(a, b):
  
 res = a+b
 
 if res>=10 and res<=19:
  return 20
  
 else:
  return res        


class Test_sorta_sum(unittest.TestCase):

    def test_1(self):
        self.assertEqual(sorta_sum(3, 4), 7)

    def test_2(self):
        self.assertEqual(sorta_sum(9, 4), 20)

    def test_3(self):
        self.assertEqual(sorta_sum(9, 4), 20)


if __name__ == '__main__':
    unittest.main()  