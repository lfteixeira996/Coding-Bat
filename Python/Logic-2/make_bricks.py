import unittest

'''

We want to make a row of bricks that is goal inches long. 
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return True if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. 
See also: Introduction to MakeBricks


make_bricks(3, 1, 8) -> True
make_bricks(3, 1, 9) -> False
make_bricks(3, 2, 10) -> True

'''

def make_bricks(small, big, goal):
  
  
  


class Test_make_bricks(unittest.TestCase):

    def test_1(self):
        self.assertEqual(make_bricks(3, 1, 8), True)

    def test_2(self):
        self.assertEqual(make_bricks(3, 1, 9), False)

    def test_3(self):
        self.assertEqual(make_bricks(3, 2, 10), True)


if __name__ == '__main__':
    unittest.main()    