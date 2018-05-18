import unittest

'''

Return True if the given string contains an appearance of "xyz" 
where the xyz is not directly preceeded by a period (.). 

So "xxyz" counts but "x.xyz" does not.

xyz_there('abcxyz') -> True
xyz_there('abc.xyz') -> False
xyz_there('xyz.abc') -> True

'''

def xyz_there(str):

    substr1 = "xyz"
    substr2 = ".xyz"
    


class Test_xyz_there(unittest.TestCase):

    def test_1(self):
        self.assertEqual(xyz_there('abcxyz'), True)

    def test_2(self):
        self.assertEqual(xyz_there('abc.xyz'), False)

    def test_3(self):
        self.assertEqual(xyz_there('xyz.abc'), True)


if __name__ == '__main__':
    unittest.main() 