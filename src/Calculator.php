<?php

declare(strict_types=1);

namespace MyProject;

class Calculator
{
    public function add(int $a, int $b): int
    {
        return $a + $b;
    }

    public function divide(int $a, int $b): float
    {
        if ($b === 0) {
            throw new \InvalidArgumentException('Cannot divide by zero');
        }
        return $a / $b;
    }
}
