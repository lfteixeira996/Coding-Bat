import unittest

'''

Given a non-negative number "num", return True if num is within 2 
of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, 
so (7 % 5) is 2. See also: Introduction to Mod


near_ten(12) -> True
near_ten(17) -> False
near_ten(19) -> True

'''

def near_ten(num):
    return num % 10 <= 2 or num % 10 >= 8



class Test_near_ten(unittest.TestCase):

    def test_1(self):
        self.assertEqual(near_ten(12), True)

    def test_2(self):
        self.assertEqual(near_ten(12), True)

    def test_3(self):
        self.assertEqual(near_ten(19), True)


if __name__ == '__main__':
    unittest.main()  