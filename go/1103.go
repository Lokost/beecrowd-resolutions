// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	for true {
		h1 := 0
		m1 := 0
		h2 := 0
		m2 := 0

		fmt.Scan(&h1)
		fmt.Scan(&m1)
		fmt.Scan(&h2)
		fmt.Scan(&m2)

		if h1+h2+m1+m2 == 0 {
			break
		} else if h1 < 24 && m1 < 60 && h2 < 24 && m2 < 60 {
			mediaTime(h1, h2, m1, m2)
		}
	}
}

func mediaTime(h1 int, h2 int, m1 int, m2 int) {
	var th int
	var tm int
	var tt int

	if h2 > h1 {
		th = h2 - h1
	} else if h2 < h1 {
		th = 24 - (h1 - h2)
	} else {
		th = 0
	}

	if m2 > m1 {
		tm = m2 - m1
	} else if m2 < m1 {
		if th == 0 {
			th = 23
		} else {
			th--
		}

		tm = 60 - (m1 - m2)
	} else {
		if th == 0 {
			th = 24
		}
		tm = 0
	}

	tt = tm + th*60
	fmt.Println(tt)
}
