import unittest
import mathUtils

class testMathUtils(unittest.TestCase):
    
    def test_add(self):
        addition = mathUtils.add(6, 7)
        self.assertEqual(addition, 13)
        
    def test_sub(self):
        subtraction = mathUtils.sub(10, 5)
        self.assertEqual(subtraction, 5)
        
    def test_mult(self):
        multiplication = mathUtils.mult(3, 2)
        self.assertEqual(multiplication, 6)
        
    def test_div(self):
        divising = mathUtils.div(21, 7)
        self.assertEqual(divising, 3)