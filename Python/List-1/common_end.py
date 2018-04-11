import unittest

'''
Given 2 arrays of ints, a and b, return True if they have the 
same first element or they have the same last element. 
Both arrays will be length 1 or more.


common_end([1, 2, 3], [7, 3]) -> True
common_end([1, 2, 3], [7, 3, 2]) -> False
common_end([1, 2, 3], [1, 3]) -> True
'''

def common_end(a, b):
  
    if a[0]==b[0] or a[len(a)-1]==b[len(b)-1]:
        return True
   
    return False


class Test_common_end(unittest.TestCase):

    def test_1(self):
        self.assertEqual(common_end([1, 2, 3], [7, 3]), True)

    def test_2(self):
        self.assertEqual(common_end([1, 2, 3], [7, 3, 2]), False)

    def test_3(self):
        self.assertEqual(common_end([1, 2, 3], [1, 3]), True)


if __name__ == '__main__':
    unittest.main() 
