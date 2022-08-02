package com.ssrngstd.freesudoku.viewmodel

import androidx.lifecycle.ViewModel
import com.ssrngstd.freesudoku.game.SudokuGame

class PlaySudokuViewModel : ViewModel(){
    val sudokuGame = SudokuGame()
}