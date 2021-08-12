#import
import pytest
#sum of 2 numbers
def test_addition():
    #initialize
    num1=10
    num2=20
    #add
    sum=num1+num2
    #validate
    assert sum == 30
#diff of 2 numbers
def test_subtraction():
    #initialize
    num1=20
    num2=10
    #add
    diff=num1-num2
    #validate
    assert diff == 10
#multiply 2 numbers
@pytest.mark.activity
def test_multiplication():
    #initialize
    num1=10
    num2=20
    #add
    prod=num1*num2
    #validate
    assert prod == 200
#division of 2 numbers
@pytest.mark.activity
def test_division():
    #initialize
    num1=25
    num2=5
    #add
    quot=num1/num2
    #validate
    assert quot == 5