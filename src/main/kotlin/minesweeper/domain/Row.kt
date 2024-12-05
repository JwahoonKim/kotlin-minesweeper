package minesweeper.domain

class Row(columns: Int) {

    init {
        require(columns > 0) { "열은 1 이상이어야 합니다." }
    }

    private val cells = List(columns) { Cell(isMine = false) }

    fun display(): String {
        return cells.joinToString(" ") { if (it.isMine) "X " else ". " }
    }

    fun getCell(col: Int): Cell {
        return cells[col]
    }

    fun countMines(): Int {
        return cells.count { it.isMine }
    }
}
