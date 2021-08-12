import pytest
#define wallet amount
@pytest.fixture
def wallet_amount ():
    amount =0
    return amount
#set up the parameterized test method
@pytest.mark.parametrize("earned, spent, expected", [(50, 20, 30), (100, 50, 50),])
def test_transactions (wallet_amount, earned, spent, expected):
    #add money to wallet
    wallet_amount += earned
    #subtract money from wallet
    wallet_amount -= spent
    #validate
    assert wallet_amount == expected