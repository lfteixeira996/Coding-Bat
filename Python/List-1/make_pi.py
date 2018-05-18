import unittest

'''
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


make_pi() -> [3, 1, 4]
'''

def make_pi():
  
    pi = [3,1,4];
 
    return pi
 
 
class Test_make_pi(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_pi(), [3, 1, 4])

if __name__ == '__main__':
    unittest.main()    