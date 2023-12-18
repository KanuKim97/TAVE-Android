package com.example.tave.util.state

sealed class CheckOTPCodeState {
    object Idle: CheckOTPCodeState()
    object IsLoading: CheckOTPCodeState()
    data class IsComplete(val result: Result<Unit>): CheckOTPCodeState()
    data class IsFailed(val result: Result<Unit>): CheckOTPCodeState()
}